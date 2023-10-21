function fetchStudentData() {
  const studentData = {
      first_name: "David ",
      last_name: "Maisuradze",
      gpa: 2.95,
      semester: 3,
  };

  const subject1Data = {
    assignment: "10/10",
    quiz: "10/10",
    exam: "75/80",
  };

  document.getElementById("student-name").textContent = studentData.first_name + " " + studentData.last_name;

  document.getElementById("student-info").children[0].innerHTML = studentData.first_name;
  document.getElementById("student-info").children[1].innerHTML = studentData.last_name;
  document.getElementById("student-info").children[2].innerHTML = studentData.semester;
  document.getElementById("student-info").children[3].innerHTML = studentData.gpa;

  document.getElementById("comp-arch").children[0].innerHTML = subject1Data.assignment;
  document.getElementById("comp-arch").children[1].innerHTML = subject1Data.quiz;
  document.getElementById("comp-arch").children[2].innerHTML = subject1Data.exam;
}

fetchStudentData();