import React from "react";
import axios from "axios";
import { useState, useEffect } from "react";
import { useNavigate, useParams, Link } from "react-router-dom";
import AuthorForm from "./AuthorForm";
import Spinner from "./Spinner";

const Update = () => {
  const { id } = useParams();
  const [author, setAuthor] = useState([]);
  const [error, setError] = useState({});
  const [loading, setLoading] = useState(false);

  const navigate = useNavigate();

  useEffect(() => {
    setLoading(true);
    axios
      .get(`http://localhost:8000/authors/${id}`)

      .then((response) => {
        setAuthor(response.data.results);
        setLoading(false);
      })
      .catch((error) => {
        console.log(error);
        setError(error);
        setLoading(false);
        navigate("/authors/404", { replace: true });
      });
  }, [id, navigate]);

  const updateAuthor = (author) => {
    axios
      .patch(`http://localhost:8000/authors/${id}/edit`, author)
      .then((res) => {
        console.log(res);
        navigate("/");
      })
      .catch((err) => {
        const errorResponse = err.response.data.errors;
        console.log(errorResponse);
        const errorObj = {};
        for (const key of Object.keys(errorResponse)) {
          errorObj[key] = errorResponse[key].message;
        }

        setError(errorObj);
      });
  };

  return (
    <div>
      {loading && <Spinner />}

      <Link className="btn btn-primary btn-lg m-3" to={"/"}>
        Home
      </Link>
      {author.name ? (
        <div>
          <h2 className="fs-2 text-info m-3">Edit this author</h2>

          <AuthorForm
            onSubmitProp={updateAuthor}
            initialName={author.name}
            error={error}
          />
        </div>
      ) : (
        ""
      )}
    </div>
  );
};

export default Update;
