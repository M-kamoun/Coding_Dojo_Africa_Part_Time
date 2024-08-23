import React from "react";
import AuthorForm from "./AuthorForm";
import axios from "axios";
import { useState } from "react";
import { useNavigate, Link } from "react-router-dom";

const Create = () => {
  const [newAuthor, setAuthor] = useState([]);
  const [error, setError] = useState({});
  const navigate = useNavigate();

  const createAuthor = (author) => {
    axios
      .post("http://localhost:8000/authors/new", author)
      .then((res) => {
        setAuthor([...newAuthor, res.data.results]);
        navigate("/");
      })
      .catch((err) => {
        const errorResponse = err.response.data.errors;

        const errorObj = {};
        for (const key of Object.keys(errorResponse)) {
          errorObj[key] = errorResponse[key].message;
        }

        setError(errorObj);
        console.log(typeof errorObj);
      });
  };

  return (
    <div>
      <Link className="btn btn-primary btn-lg m-3" to={"/"}>
        Home
      </Link>
      <h2 className="fs-2 text-info m-3">Add a new author</h2>
      <AuthorForm onSubmitProp={createAuthor} initialName="" error={error} />
    </div>
  );
};

export default Create;
