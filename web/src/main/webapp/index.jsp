<!DOCTYPE html>
<html>
<body>
<h2>Library by me</h2>

<html lang="en">
<head>
    <title>Bootstrap Example</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-2/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
    <table class="table table-bordered">
        <thead>
        <tr>
            <th>Lp</th>
            <th>Title</th>
            <th>Isbn</th>
            <th>Category</th>
            <th>Release</th>
            <th>Pages</th>
            <th>Author</th>
            <th>edit</th>
        </tr>
        </thead>
        <c:forEach var="book" items="${requestScope.books}" varStatus="loop">
        <tr>
            <th scope="row"> ${loop.index+1}</th>
            <td>${book.title}</td>
            <td>$[book.isbn}</td>
            <td>${book.authorName}</td>
            <td>${book.category}</td>
            <td>${book.release}</td>
            <td>${book.pages}</td>
            <td>${not empty book.borrowerName ? book.borrowerName : '-'}</td>
            <td input> class="form-check-input" type="radio" name="bookId" value="${book.id}" checked></td>
        </tr>
    </c:forEach>

        </tbody>
    </table>
</div>
<a href="addAuthor.jsp"><button type="button" class="btn btn-dark">ADD </button></a>
<a href="editBook.jsp"><button type="button" class="btn btn-dark">EDIT</button></a>
<a href=""><button type="button" class="btn btn-dark">DELETE</button></a>
<a href="bookDetails.jsp"><button type="button" class="btn btn-dark">SHOW</button></a>
</body>
</html>
</body>
</html>
