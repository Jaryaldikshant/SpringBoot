<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Job Portal - Add Job</title>

	<link
			href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
			rel="stylesheet"
			integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
			crossorigin="anonymous">

	<style>
		body {
			background: linear-gradient(135deg, #f5f7fa 0%, #c3cfe2 100%);
			font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
			min-height: 100vh;
		}

		.navbar {
			background: #fff !important;
			box-shadow: 0 2px 10px rgba(0,0,0,0.1);
			border-bottom: 3px solid #007bff;
		}

		.navbar-brand {
			color: #007bff !important;
			font-weight: 600;
		}

		.nav-link {
			color: #495057 !important;
			font-weight: 500;
			transition: color 0.3s ease;
		}

		.nav-link:hover {
			color: #007bff !important;
		}

		.card {
			border: none;
			border-radius: 15px;
			box-shadow: 0 5px 15px rgba(0,0,0,0.08);
			background: white;
		}

		.card-body {
			padding: 2.5rem;
		}

		h2 {
			color: #495057;
			font-weight: 600;
			margin-bottom: 2rem;
		}

		.form-label {
			color: #495057;
			font-weight: 500;
			margin-bottom: 0.5rem;
		}

		.form-control, .form-select {
			border: 2px solid #e9ecef;
			border-radius: 8px;
			padding: 0.75rem;
			transition: border-color 0.3s ease, box-shadow 0.3s ease;
			background: #fff;
		}

		.form-control:focus, .form-select:focus {
			border-color: #007bff;
			box-shadow: 0 0 0 0.2rem rgba(0,123,255,0.25);
		}

		.form-select[multiple] {
			min-height: 120px;
		}

		.btn-primary {
			background: #007bff;
			border: none;
			border-radius: 8px;
			padding: 0.75rem 2rem;
			font-weight: 500;
			width: 100%;
			transition: all 0.3s ease;
		}

		.btn-primary:hover {
			background: #0056b3;
			transform: translateY(-2px);
			box-shadow: 0 5px 15px rgba(0,123,255,0.3);
		}

		.mb-1, .mb-2 {
			margin-bottom: 1.25rem !important;
		}

		textarea {
			resize: vertical;
			min-height: 100px;
		}

		.form-select option:checked {
			background-color: #007bff;
		}
	</style>
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-light">
	<div class="container">
		<a class="navbar-brand fs-3 fw-bold" href="#">Job Portal</a>
		<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarNav"
				aria-controls="navbarNav" aria-expanded="false"
				aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarNav">
			<ul class="navbar-nav ms-auto">
				<li class="nav-item"><a class="nav-link" href="home">Home</a></li>
				<li class="nav-item"><a class="nav-link" href="viewalljobs">All Jobs</a></li>
				<li class="nav-item"><a class="nav-link" href="https://telusko.com/">Contact</a></li>
			</ul>
		</div>
	</div>
</nav>

<div class="container mt-5">
	<div class="row justify-content-center">
		<div class="col-md-8">
			<div class="card">
				<div class="card-body">
					<h2 class="text-center">Post a New Job</h2>
					<form action="handleForm" method="post">
						<div class="mb-1">
							<label for="postId" class="form-label">Post ID</label>
							<input type="text" class="form-control" id="postId"
								   name="postId" required placeholder="Enter unique post ID">
						</div>

						<div class="mb-1">
							<label for="postProfile" class="form-label">Post Profile</label>
							<input type="text" class="form-control" id="postProfile"
								   name="postProfile" required placeholder="e.g., Senior Java Developer">
						</div>

						<div class="mb-1">
							<label for="postDesc" class="form-label">Post Description</label>
							<textarea class="form-control" id="postDesc" name="postDesc"
									  rows="2" required placeholder="Describe the role, responsibilities, and requirements..."></textarea>
						</div>

						<div class="mb-1">
							<label for="reqExperience" class="form-label">Required Experience</label>
							<input type="number" class="form-control" id="reqExperience"
								   name="reqExperience" required placeholder="Years of experience">
						</div>

						<div class="mb-2">
							<label for="postTechStack" class="form-label">Tech Stack</label>
							<select multiple class="form-select" id="postTechStack" name="postTechStack" required>
								<option value="Java">Java</option>
								<option value="JavaScript">JavaScript</option>
								<option value="Swift">Swift</option>
								<option value="TypeScript">TypeScript</option>
								<option value="Go">Go</option>
								<option value="Kotlin">Kotlin</option>
								<option value="Rust">Rust</option>
								<option value="PHP">PHP</option>
								<option value="HTML5">HTML5</option>
								<option value="CSS3">CSS3</option>
								<option value="GraphQL">GraphQL</option>
								<option value="Raspberry Pi">Raspberry Pi</option>
								<option value="Arduino">Arduino</option>
								<option value="IoT (Internet of Things)">IoT (Internet of Things)</option>
								<option value="Apache Kafka">Apache Kafka</option>
								<option value="Elasticsearch">Elasticsearch</option>
								<option value="Unity">Unity</option>
								<option value="Game Development">Game Development</option>
								<option value="Vue.js">Vue.js</option>
								<option value="Angular">Angular</option>
								<option value="React Native">React Native</option>
								<option value="Flutter">Flutter</option>
								<option value="Node.js">Node.js</option>
								<option value="Express.js">Express.js</option>
								<option value="Django">Django</option>
								<option value="Flask">Flask</option>
								<option value="Ruby on Rails">Ruby on Rails</option>
								<option value="Laravel">Laravel</option>
								<option value="TensorFlow">TensorFlow</option>
								<option value="PyTorch">PyTorch</option>
								<option value="Kubernetes">Kubernetes</option>
								<option value="Docker">Docker</option>
								<option value="Jenkins">Jenkins</option>
								<option value="AWS (Amazon Web Services)">AWS (Amazon Web Services)</option>
								<option value="Azure">Azure</option>
								<option value="Google Cloud">Google Cloud</option>
								<option value="DevOps">DevOps</option>
								<option value="Blockchain">Blockchain</option>
								<option value="Machine Learning">Machine Learning</option>
								<option value="Artificial Intelligence">Artificial Intelligence</option>
								<option value="Cybersecurity">Cybersecurity</option>
								<option value="CISSP (Certified Information Systems Security Professional)">CISSP (Certified Information Systems Security Professional)</option>
								<option value="CompTIA Security+">CompTIA Security+</option>
								<option value="Certified Ethical Hacker (CEH)">Certified Ethical Hacker (CEH)</option>
								<option value="Scrum">Scrum</option>
								<option value="Agile">Agile</option>
								<option value="Kanban">Kanban</option>
							</select>
						</div>

						<button type="submit" class="btn btn-primary">Submit</button>
					</form>
				</div>
			</div>
		</div>
	</div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
		crossorigin="anonymous"></script>
</body>
</html>

