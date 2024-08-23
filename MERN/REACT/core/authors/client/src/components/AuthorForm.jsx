import React from "react";
import { useState } from "react";
import { Link } from "react-router-dom";

const AuthorForm = ({ initialName, onSubmitProp, error }) => {
  const [name, setName] = useState(initialName);

  const onSubmitHandler = (e) => {
    e.preventDefault();
    onSubmitProp({ name });
    setName("");
  };

  return (
    <div>
      <div className="row m-3">
        <div className="col-lg-6 card">
          <div className="card-body">
            <form onSubmit={onSubmitHandler}>
              <label className="form-label"> Name: </label>
              <input
                className="form-control"
                type="text"
                name="name"
                value={name}
                onChange={(e) => setName(e.target.value)}
              />
              {error.name && (
                <p className="fs-5 fst-bold text-danger">{`${error.name
                  .charAt(0)
                  .toUpperCase()}${error.name.slice(1)}`}</p>
              )}
              <div className="d-flex  gap-2 mt-3">
                <input
                  type="submit"
                  value="Submit"
                  className="btn btn-success"
                />
                <Link to={"/"} type="submit" className="btn btn-primary">
                  Cancel
                </Link>
              </div>
            </form>
          </div>
        </div>
      </div>
    </div>
  );
};

export default AuthorForm;
