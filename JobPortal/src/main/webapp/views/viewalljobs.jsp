<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>All Jobs - Job Portal</title>
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
            height: 100%;
        }

        .card:hover {
            transform: translateY(-3px);
            box-shadow: 0 8px 25px rgba(0,0,0,0.15);
        }

        .card-body {
            padding: 1.5rem;
        }

        .card-title {
            color: #007bff;
            font-weight: 600;
            font-size: 1.25rem;
            margin-bottom: 1rem;
        }

        .info-item {
            margin-bottom: 1rem;
            padding: 0.75rem;
            background: #f8f9fa;
            border-radius: 6px;
        }

        .info-label {
            font-weight: 600;
            color: #495057;
            font-size: 0.9rem;
        }

        .info-value {
            color: #6c757d;
            margin-top: 0.3rem;
        }

        .tech-stack {
            display: flex;
            flex-wrap: wrap;
            gap: 0.4rem;
            margin-top: 0.5rem;
        }

        .tech-badge {
            background: #007bff;
            color: white;
            padding: 0.2rem 0.6rem;
            border-radius: 12px;
            font-size: 0.75rem;
            font-weight: 500;
        }

        h2 {
            color: #495057;
            font-weight: 600;
        }

        .row-cols-2 {
            --bs-gutter-x: 1.5rem;
            --bs-gutter-y: 1.5rem;
        }

        @media (max-width: 768px) {
            .row-cols-2 {
                --bs-columns: 1;
            }
        }
    </style>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light">
    <div class="container">
        <a class="navbar-brand fs-3 fw-bold" href="#"> Job Portal</a>
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
    <h2 class="text-center mb-5">Available Job Positions</h2>
    <div class="row row-cols-2">
        <c:forEach var="jobPost" items="${jobPosts}">
            <div class="col mb-4">
                <div class="card">
                    <div class="card-body">
                        <h5 class="card-title">
                            💼 ${jobPost.postProfile}
                        </h5>

                        <div class="info-item">
                            <div class="info-label">📝 Description</div>
                            <div class="info-value">${jobPost.postDesc}</div>
                        </div>

                        <div class="info-item">
                            <div class="info-label">📈 Experience Required</div>
                            <div class="info-value">${jobPost.reqExperience} years</div>
                        </div>

                        <div class="info-item">
                            <div class="info-label">⚡ Technology Stack</div>
                            <div class="tech-stack">
                                <c:forEach var="tech" items="${jobPost.postTechStack}">
                                    <span class="tech-badge">${tech}</span>
                                </c:forEach>
                            </div>
                        </div>
                    </div>
                    <div class="card-footer">
                        <!-- Optional footer content -->
                    </div>
                </div>
            </div>
        </c:forEach>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
        crossorigin="anonymous"></script>
</body>
</html>
