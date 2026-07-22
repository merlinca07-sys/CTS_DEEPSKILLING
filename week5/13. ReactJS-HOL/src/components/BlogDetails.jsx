function BlogDetails({ blogs }) {
  return (
    <>
      <h1>Blog Details</h1>

      {blogs.map((blog) => (
        <div key={blog.id}>
          <h2>{blog.title}</h2>
          <h3>{blog.author}</h3>
          <p>{blog.description}</p>
        </div>
      ))}
    </>
  );
}

export default BlogDetails;