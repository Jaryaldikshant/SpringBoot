<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ page import="com.example.JobPortal.model.JobPost" %>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Job Details - Job Portal</title>
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

        .card-title {
            color: #007bff;
            font-weight: 600;
            font-size: 1.5rem;
            margin-bottom: 1.5rem;
        }

        .info-section {
            margin-bottom: 1.5rem;
            padding: 1rem;
            background: #f8f9fa;
            border-radius: 8px;
            border-left: 4px solid #007bff;
        }

        .info-label {
            font-weight: 600;
            color: #495057;
            margin-bottom: 0.5rem;
        }

        .info-content {
            color: #6c757d;
            line-height: 1.6;
        }

        .tech-stack {
            display: flex;
            flex-wrap: wrap;
            gap: 0.5rem;
            margin-top: 0.5rem;
        }

        .tech-badge {
            background: #007bff;
            color: white;
            padding: 0.3rem 0.8rem;
            border-radius: 15px;
            font-size: 0.85rem;
            font-weight: 500;
        }

        h2 {
            color: #495057;
            font-weight: 600;
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
                <li class="nav-item">
                    <a class="nav-link" href="home">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="viewalljobs">All Jobs</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="https://telusko.com/">Contact</a>
                </li>
            </ul>
        </div>
    </div>
</nav>

<%
    JobPost myJobPost = (JobPost) request.getAttribute("jobPost");
%>

<div class="container mt-5">
    <h2 class="text-center mb-5">Job Details</h2>
    <div class="row justify-content-center">
        <div class="col-md-8">
            <div class="card">
                <div class="card-body">
                    <h5 class="card-title">
                        💼 <%= myJobPost.getPostProfile() %>
                    </h5>

                    <div class="info-section">
                        <div class="info-label">📝 Job Description</div>
                        <div class="info-content"><%= myJobPost.getPostDesc() %></div>
                    </div>

                    <div class="info-section">
                        <div class="info-label">📈 Experience Required</div>
                        <div class="info-content"><%= myJobPost.getReqExperience() %> years</div>
                    </div>

                    <div class="info-section">
                        <div class="info-label">⚡ Technology Stack</div>
                        <div class="tech-stack">
                            <% for (String tech : myJobPost.getPostTechStack()) { %>
                                <span class="tech-badge"><%= tech %></span>
                            <% } %>
                        </div>
                    </div>
                </div>
                <div class="card-footer">
                    <!-- Optional footer content -->
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
