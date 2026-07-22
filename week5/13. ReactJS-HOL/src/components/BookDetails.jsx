function BookDetails({ books }) {
  return (
    <>
      <h1>Book Details</h1>

      {books.map((book) => (
        <div key={book.id}>
          <h3 className="book-name">{book.bname}</h3>
          <p className="book-price">{book.price}</p>
        </div>
      ))}
    </>
  );
}

export default BookDetails;