<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Job Portal</title>
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
			transition: transform 0.3s ease, box-shadow 0.3s ease;
			background: white;
		}

		.card:hover {
			transform: translateY(-5px);
			box-shadow: 0 10px 25px rgba(0,0,0,0.15);
		}

		.card-body {
			padding: 3rem 2rem;
		}

		.btn-primary {
			background: #007bff;
			border: none;
			border-radius: 10px;
			padding: 0.75rem 2rem;
			font-weight: 500;
			font-size: 1.1rem;
			transition: all 0.3s ease;
		}

		.btn-primary:hover {
			background: #0056b3;
			transform: translateY(-2px);
			box-shadow: 0 5px 15px rgba(0,123,255,0.3);
		}

		.container.mt-5 {
			padding-top: 2rem;
		}
	</style>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light">
	<div class="container">
		<a class="navbar-brand fs-3 fw-bold" href="#">
			Job Portal
		</a>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav"
				aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNav">
			<ul class="navbar-nav ms-auto">
				<li class="nav-item">
					<a class="nav-link" href="home">Home</a>
				</li>
				<li class="nav-item">
					<a class="nav-link" href="viewalljobs">All Jobs</a>
				</li>
				<li class="nav-item">
					<a class="nav-link" href="">Contact</a>
				</li>
			</ul>
		</div>
	</div>
</nav>

<div class="container mt-5">
	<div class="row justify-content-center">
		<div class="col-md-10">
			<h1 class="text-center mb-5" style="color: #495057; font-weight: 600;">Welcome to Job Portal</h1>
			<div class="row g-4">
				<!-- View All Jobs Card -->
				<div class="col-md-6">
					<div class="card h-100">
						<div class="card-body d-flex flex-column align-items-center justify-content-center">
							<div class="mb-4" style="font-size: 4rem; color: #007bff;">
								📋
							</div>
							<h3 class="card-title text-center mb-3" style="color: #495057;">Browse Jobs</h3>
							<p class="text-center text-muted mb-4">Explore all available job opportunities</p>
							<a href="/viewalljobs" class="btn btn-primary">View All Jobs</a>
						</div>
					</div>
				</div>
				<!-- Add Job Card -->
				<div class="col-md-6">
					<div class="card h-100">
						<div class="card-body d-flex flex-column align-items-center justify-content-center">
							<div class="mb-4" style="font-size: 4rem; color: #28a745;">
								➕
							</div>
							<h3 class="card-title text-center mb-3" style="color: #495057;">Post a Job</h3>
							<p class="text-center text-muted mb-4">Create a new job posting</p>
							<a href="/addjob" class="btn btn-primary">Add New Job</a>
						</div>
					</div>
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
