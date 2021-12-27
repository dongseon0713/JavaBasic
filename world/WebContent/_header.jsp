<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

   <nav class="navbar navbar-expand-sm navbar-dark bg-dark" aria-label="Third navbar example">
    <div class="container-fluid">
      <a class="navbar-brand" href="#">dongseon's home</a>
      <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarsExample03" aria-controls="navbarsExample03" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>

      <div class="collapse navbar-collapse" id="navbarsExample03">
        <ul class="navbar-nav me-auto mb-2 mb-sm-0">
          <li class="nav-item">
            <a class="nav-link active" aria-current="page" href="/">홈</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="a.html">자기소개</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="c.html">경력소개</a>
          </li>
<!--           <li class="nav-item">
            <a class="nav-link disabled">Disabled</a>
          </li> -->
          <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" href="p.html" id="dropdown03" data-bs-toggle="dropdown" aria-expanded="false">포트폴리오</a>
            <ul class="dropdown-menu" aria-labelledby="dropdown03">
              <li><a class="dropdown-item" href="#">기본</a></li>
              <li><a class="dropdown-item" href="#">프로잭트 1</a></li>
              <li><a class="dropdown-item" href="#">프로잭트 2</a></li>
            </ul>
            <li class="nav-item">
            <a class="nav-link" href="t.html">연락처</a>
          </li>
          </li>
        </ul>
        <form>
          <input class="form-control" type="text" placeholder="Search" aria-label="Search">
        </form>
      </div>
    </div>
  </nav>