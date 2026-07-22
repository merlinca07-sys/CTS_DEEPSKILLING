function IndianPlayers() {

    // Indian Team
    const IndianTeam = [
        "Sachin",
        "Dhoni",
        "Virat",
        "Rohit",
        "Yuvraj",
        "Raina"
    ];

    // Destructuring
    const [first, second, third, fourth, fifth, sixth] = IndianTeam;

    // T20 Players
    const T20Players = [
        "First Player",
        "Second Player",
        "Third Player"
    ];

    // Ranji Trophy Players
    const RanjiTrophyPlayers = [
        "Fourth Player",
        "Fifth Player",
        "Sixth Player"
    ];

    // Merge Arrays
    const IndianPlayersMerged = [
        ...T20Players,
        ...RanjiTrophyPlayers
    ];

    return (
        <div>

            <h1>Indian Team</h1>

            <h2>Odd Players</h2>
            <ul>
                <li>First : {first}</li>
                <li>Third : {third}</li>
                <li>Fifth : {fifth}</li>
            </ul>

            <hr />

            <h2>Even Players</h2>
            <ul>
                <li>Second : {second}</li>
                <li>Fourth : {fourth}</li>
                <li>Sixth : {sixth}</li>
            </ul>

            <hr />

            <h2>List of Indian Players Merged</h2>

            <ul>
                {IndianPlayersMerged.map((player, index) => (
                    <li key={index}>
                        Mr. {player}
                    </li>
                ))}
            </ul>

        </div>
    );
}

export default IndianPlayers;