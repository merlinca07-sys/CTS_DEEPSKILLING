function GuestGreeting() {
    return (
        <div>
            <h2>Flight Details</h2>

            <table border="1" cellPadding="10">
                <thead>
                    <tr>
                        <th>Flight</th>
                        <th>From</th>
                        <th>To</th>
                        <th>Time</th>
                    </tr>
                </thead>

                <tbody>
                    <tr>
                        <td>AI202</td>
                        <td>Chennai</td>
                        <td>Delhi</td>
                        <td>10:00 AM</td>
                    </tr>

                    <tr>
                        <td>6E501</td>
                        <td>Bangalore</td>
                        <td>Mumbai</td>
                        <td>2:30 PM</td>
                    </tr>
                </tbody>
            </table>

            <h3>Please Login to Book Tickets</h3>
        </div>
    );
}

export default GuestGreeting;