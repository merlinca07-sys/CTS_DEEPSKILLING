function CourseDetails({ courses }) {
  return (
    <>
      <h1>Course Details</h1>

      {courses.map((course) => (
        <div key={course.id}>
          <h2 className="course-name">{course.cname}</h2>
          <p className="course-date">{course.date}</p>
        </div>
      ))}
    </>
  );
}

export default CourseDetails;