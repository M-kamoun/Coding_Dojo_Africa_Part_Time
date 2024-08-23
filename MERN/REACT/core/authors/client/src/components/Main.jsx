import { useEffect, useState } from "react";
import axios from "axios";
import { Link } from "react-router-dom";
import Spinner from "./Spinner";

const Main = () => {
  const [list, setList] = useState([]);
  const [loading, setLoading] = useState(false);

  useEffect(() => {
    setLoading(true);
    axios
      .get("http://localhost:8000/authors")
      .then((res) => {
        setList(res.data.results);
        setLoading(false);
      })
      .catch((err) => {
        console.log(err);
        setLoading(false);
      });
  }, []);

  const deleteAuthor = (id) => {
    axios
      .delete(`http://localhost:8000/authors/${id}/delete`)
      .then((res) => console.log(res.data.results))
      .catch((err) => console.log(err));
    setList(list.filter((author) => author._id !== id));
  };

  return (
    <div className="container-fluid">
      <Link className="btn btn-primary btn-lg my-3" to={"/authors/new"}>
        Add an author
      </Link>
      <h2 className="fs-2 text-info">We have quotes by</h2>

      <div className="row">
        <div className="col-lg-6">
          {loading ? (
            <Spinner />
          ) : list.length > 0 ? (
            <table className="table table-striped">
              <thead>
                <tr>
                  <th>Name</th>
                  <th>Actions Available</th>
                </tr>
              </thead>
              <tbody>
                {list.map((author, i) => (
                  <tr key={i}>
                    <td className=" fs-5 align-middle">{author.name}</td>

                    <td>
                      <Link
                        className="btn btn-primary btn-lg ms-2"
                        to={`/authors/${author._id}/edit`}
                      >
                        Update
                      </Link>
                      <button
                        className="btn btn-danger btn-lg ms-2"
                        onClick={() => deleteAuthor(author._id)}
                      >
                        Delete
                      </button>
                    </td>
                  </tr>
                ))}
              </tbody>
            </table>
          ) : (
            <p className="fs-3 text-danger">No authors found!</p>
          )}
        </div>
      </div>
    </div>
  );
};

export default Main;
