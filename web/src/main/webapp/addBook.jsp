<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<div class="container">
    <form action="/addBookServlet.jsp" method="post">
        <div class="form-group">
            <label for="exampleInputTitle">Title</label>
            <input type="text" class="form-control" id="exampleInputTitle" name="title" placeholder="Title">
        </div>
        <div class="form-group">
            <label for="exampleInputCategory">Category</label>
            <input type="text" class="form-control" id="exampleInputCategory" name="category" placeholder="Category">
        </div>
        <div class="form-group">
            <label for="exampleInputisbn">ISBN</label>
            <input type="number" class="form-control" id="exampleInputisbn" name="phone" placeholder="Phone">
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

<div>
    <a><button type="button"onclick="succesAddedMessage()">ADD </button></a>
    <a href="index.jsp"><button type="button" class="btn btn-dark">CANCEL</button></a>
</div>

<p id="demo"></p>
<script>
    function succesAddedMessage() {
        document.getElementById("demo").innerHTML = "Book added succesful";
    }
</script>

<jsp:forward page="index.jsp"/>
</body>
</html>
