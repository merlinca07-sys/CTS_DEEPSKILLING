import { useState } from "react";

function EventExamples() {

    const [count, setCount] = useState(0);

    // Increment Counter
    const increment = () => {
        setCount(count + 1);
    };

    // Decrement Counter
    const decrement = () => {
        setCount(count - 1);
    };

    // Hello Message
    const sayHello = () => {
        alert("Hello! Welcome to React Events");
    };

    // Multiple Functions
    const handleIncrease = () => {
        increment();
        sayHello();
    };

    // Function with Argument
    const sayWelcome = (message) => {
        alert(message);
    };

    // Synthetic Event
    const handlePress = () => {
        alert("I was clicked");
    };

    return (
        <div>

            <h2>Counter Example</h2>

            <h3>Counter : {count}</h3>

            <button onClick={handleIncrease}>
                Increment
            </button>

            <button onClick={decrement}>
                Decrement
            </button>

            <br /><br />

            <button
                onClick={() => sayWelcome("Welcome")}
            >
                Say Welcome
            </button>

            <br /><br />

            <button onClick={handlePress}>
                OnPress
            </button>

        </div>
    );
}

export default EventExamples;