import React from "react";
import { Link } from "react-router-dom";

const NotFound = () => {
  return (
    <div>
      <Link className="btn btn-primary btn-lg m-3" to={"/"}>
        Home
      </Link>
      <div className="alert alert-danger w-75 ms-5 mt-5">
        <h3>
          We are sorry, but we could not find the author you are looking for.
          Would you like to add this author to our database?
          <Link
            className="link-primary link-underline-opacity-0 "
            to={"/authors/new"}
          >
            Add an author
          </Link>
        </h3>
      </div>
    </div>
  );
};

export default NotFound;
