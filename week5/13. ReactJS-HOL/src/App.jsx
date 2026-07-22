import "./App.css";
import { books, blogs, courses } from "./data";
import BookDetails from "./components/BookDetails";
import BlogDetails from "./components/BlogDetails";
import CourseDetails from "./components/CourseDetails";

function App() {
  return (
    <div className="container">

      <div className="section border">
        <CourseDetails courses={courses} />
      </div>

      <div className="section border">
        <BookDetails books={books} />
      </div>

      <div className="section">
        <BlogDetails blogs={blogs} />
      </div>

    </div>
  );
}

export default App;