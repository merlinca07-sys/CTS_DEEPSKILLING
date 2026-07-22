import office from "./image/office.jpg";
import "./App.css";

function App() {

  const officeList = [
    {
      Name: "DBS",
      Rent: 50000,
      Address: "Chennai",
      Image: office
    },
    {
      Name: "Regus",
      Rent: 65000,
      Address: "Bangalore",
      Image: office
    },
    {
      Name: "WeWork",
      Rent: 80000,
      Address: "Hyderabad",
      Image: office
    }
  ];

  return (
    <div className="container">

      <h1>Office Space, at Affordable Range</h1>

      {
        officeList.map((item,index)=>{

          const rentStyle={
            color:item.Rent<60000 ? "red":"green"
          }

          return(

            <div key={index} className="card">

              <img
                src={item.Image}
                alt="Office Space"
                width="300"
              />

              <h2>Name: {item.Name}</h2>

              <h3 style={rentStyle}>
                Rent Rs. {item.Rent}
              </h3>

              <h3>
                Address: {item.Address}
              </h3>

            </div>

          )

        })
      }

    </div>
  );
}

export default App;