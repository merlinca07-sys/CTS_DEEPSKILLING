import { useState } from "react";

function CurrencyConvertor() {

    const [rupees, setRupees] = useState("");
    const [euro, setEuro] = useState("");

    const handleSubmit = () => {

        const rate = 0.011;

        const convertedValue = rupees * rate;

        setEuro(convertedValue.toFixed(2));
    };

    return (

        <div>

            <h2>Currency Convertor</h2>

            <input
                type="number"
                placeholder="Enter Rupees"
                value={rupees}
                onChange={(e) => setRupees(e.target.value)}
            />

            <br /><br />

            <button onClick={handleSubmit}>
                Convert
            </button>

            <br /><br />

            <h3>Euro : € {euro}</h3>

        </div>

    );
}

export default CurrencyConvertor;