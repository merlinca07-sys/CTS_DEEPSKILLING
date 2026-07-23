import React, { Component } from "react";

class ComplaintRegister extends Component {

  constructor() {
    super();

    this.state = {
      ename: "",
      complaint: ""
    };
  }

  handleChange = (event) => {
    this.setState({
      [event.target.name]: event.target.value
    });
  };

  handleSubmit = (event) => {

    event.preventDefault();

    const referenceNo = Math.floor(
      100000 + Math.random() * 900000
    );

    alert(
      `Thanks ${this.state.ename}

Your Complaint was Submitted Successfully.

Reference ID is : ${referenceNo}`
    );
  };

  render() {
    return (
      <div className="container">

        <h1>Register your complaints here!!!</h1>

        <form onSubmit={this.handleSubmit}>

          <table>

            <tbody>

              <tr>
                <td>Name</td>

                <td>
                  <input
                    type="text"
                    name="ename"
                    value={this.state.ename}
                    onChange={this.handleChange}
                    required
                  />
                </td>
              </tr>

              <tr>

                <td>Complaint</td>

                <td>

                  <textarea
                    name="complaint"
                    rows="3"
                    cols="22"
                    value={this.state.complaint}
                    onChange={this.handleChange}
                    required
                  />

                </td>

              </tr>

              <tr>

                <td></td>

                <td>
                  <button type="submit">
                    Submit
                  </button>
                </td>

              </tr>

            </tbody>

          </table>

        </form>

      </div>
    );
  }
}

export default ComplaintRegister;