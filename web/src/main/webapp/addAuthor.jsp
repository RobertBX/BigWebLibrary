
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register Form</title>
    <link rel="stylesheet" href="/webjars/bootstrap/4.0.0-2/css/bootstrap.min.css">
</head>
<body>
<div class="container">
    <form action="/AddAuthorServlet" method="post">
        <div class="form-group">
            <label for="exampleInputUsername">Username</label>
            <input type="text" class="form-control" id="exampleInputUsername" name="username" placeholder="Username">
        </div>
        <div class="form-group">
            <label for="exampleInputFirstName">first name</label>
            <input type="text" class="form-control" id="exampleInputFirstName" name="firstName" placeholder="FirstName">
        </div>
        <div class="form-group">
            <label for="exampleInputLastName">last name</label>
            <input type="text" class="form-control" id="exampleInputLastName" name="lastName" placeholder="LastName">
        </div>
        <div class="form-group">
            <label for="exampleInputEmail1">Email address</label>
            <input type="email" class="form-control" id="exampleInputEmail1" name="email" aria-describedby="emailHelp" placeholder="Enter email">
            <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
        </div>
        <div class="form-group">
            <div class="custom-control custom-radio custom-control-inline">
                <input type="radio" id="customRadioInline1" name="gender" value="MALE" class="custom-control-input">
                <label class="custom-control-label" for="customRadioInline1">male</label>
            </div>
            <div class="custom-control custom-radio custom-control-inline">
                <input type="radio" id="customRadioInline2" name="gender" value="FEMALE" class="custom-control-input">
                <label class="custom-control-label" for="customRadioInline2">female</label>
            </div>
        </div>
        <button type="submit" class="btn btn-primary">Submit</button>
    </form>
</div>
</body>
</html>
