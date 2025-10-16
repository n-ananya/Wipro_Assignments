// Show current date and time
document.getElementById("datetime").innerText = new Date().toLocaleString();

// Timer alert after 3 minutes
setTimeout(() => {
  alert("3 mins past");
}, 180000); // 3 minutes in milliseconds

function validateForm() {
  const firstName = document.getElementById("firstName").value.trim();
  const lastName = document.getElementById("lastName").value.trim();
  const password = document.getElementById("password").value;
  const confirmPassword = document.getElementById("confirmPassword").value;
  const gender = document.querySelector('input[name="gender"]:checked');
  const mobile = document.getElementById("mobile").value.trim();
  const dob = document.getElementById("dob").value.trim();
  const email = document.getElementById("email").value.trim();

  const nameRegex = /^[A-Za-z]+$/;
  const mobileRegex = /^(\d{3}[-.\s]){2}\d{4}$/;
  const dobRegex = /^\d{2}-\d{2}-\d{4}$/;
  const emailRegex = /^[^@]+@[^@]+\.[^@]+$/;

  if (!firstName || !nameRegex.test(firstName)) {
    alert("Enter a valid First Name (letters only)");
    return false;
  }

  if (!lastName || !nameRegex.test(lastName)) {
    alert("Enter a valid Last Name (letters only)");
    return false;
  }

  if (!password || password.length < 6 || password.length > 20) {
    alert("Password must be 6–20 characters");
    return false;
  }

  if (!confirmPassword || confirmPassword !== password) {
    alert("Confirm Password must match Password");
    return false;
  }

  if (!gender) {
    alert("Please select a gender");
    return false;
  }

  if (!mobile || !mobileRegex.test(mobile)) {
    alert("Enter valid Mobile Number (XXX-XXX-XXXX or similar)");
    return false;
  }

  if (!dob || !dobRegex.test(dob)) {
    alert("Enter DOB in DD-MM-YYYY format");
    return false;
  }

  if (!email || !emailRegex.test(email)) {
    alert("Enter a valid Email address");
    return false;
  }

  return true;
}
