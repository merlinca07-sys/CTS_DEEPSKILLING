import React, { Component } from "react";

class Getuser extends Component {

  constructor() {
    super();

    this.state = {
      title: "",
      firstName: "",
      image: ""
    };
  }

  async componentDidMount() {
    try {

      const response = await fetch("https://randomuser.me/api/");

      const data = await response.json();

      const user = data.results[0];

      this.setState({
        title: user.name.title,
        firstName: user.name.first,
        image: user.picture.large
      });

    } catch (error) {
      console.log(error);
    }
  }

  render() {

    return (
      <div className="container">

        <h1>Random User Details</h1>

        <img
          src={this.state.image}
          alt="User"
        />

        <h2>
          {this.state.title}. {this.state.firstName}
        </h2>

      </div>
    );
  }
}

export default Getuser;