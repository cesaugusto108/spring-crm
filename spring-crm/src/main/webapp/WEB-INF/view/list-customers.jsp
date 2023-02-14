<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

    <!DOCTYPE html>
    <html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Barlow&family=Fredoka+One&display=swap" rel="stylesheet">

        <style>
            body {
                line-height: 1.5;
                font-family: 'Barlow', sans-serif;
                color: #5a5555;
                padding: 0;
                margin: 0;
            }

            h1 {
                font-size: 2.8rem;
            }

            table {
                padding: 1rem;
                width: 75%;
                margin: 0 auto;
                border: 1px solid gainsboro;
                border-radius: 5px;
            }

            thead {
                background-color: rgb(247, 244, 244);
            }

            th {
                padding: 1rem;
                border-radius: 5px;
            }

            tr {
                text-align: center;
            }

            tbody tr:hover {
                background-color: whitesmoke;
            }

            td {
                padding: 0.8rem;
                border-bottom: 1px solid rgb(247, 244, 244);
            }

            a {
                text-decoration: none;
                color: dimgray;
            }

            a:hover {
                font-weight: bold;
                color: cornflowerblue;
            }

            .header {
                background-color: gainsboro;
                padding: 1rem;
                margin-bottom: 1rem;
                display: flex;
                justify-content: space-around;
                align-items: center;
            }

            .btn {
                height: 35px;
                padding: 0px 20px;
                margin: auto 0;
                background-color: rgb(247, 244, 244);
                border-radius: 5px;
                border: none;
                cursor: pointer;
            }

            .btn:hover {
                background-color: #5a5555;
                color: aliceblue;
            }

            .container {
                width: 70vw;
                margin: 0 auto;
            }

            .delete {
                color: orangered;
            }

            .delete:hover {
                font-weight: bold;
                color: red;
            }
        </style>

        <title>Customers list</title>
    </head>

    <body>
        <div class="wrapper">
            <div class="header">
                <h1>CRM - Customer Relationship Manager</h1>
                <input type="button" value="Add Customer" onclick="window.location.href='../adding-form'; return false;"
                    class="btn" />
            </div>
        </div>
        <div class="container">
            <div class="content">
                <table>
                    <thead>
                        <tr>
                            <th>First name</th>
                            <th>Last name</th>
                            <th>Email</th>
                            <th></th>
                            <th></th>
                        </tr>
                    </thead>

                    <tbody>
                        <c:forEach var="customer" items="${customers}">
                            <c:url var="update" value="../update-form">
                                <c:param name="customer-id" value="${customer.id}" />
                            </c:url>

                            <tr>
                                <td>${customer.name.firstName}</td>
                                <td>${customer.name.lastName}</td>
                                <td>${customer.email}</td>
                                <td><a href="${update}">update</a></td>
                                <td><a href="" class="delete">delete</a></td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </body>

    </html>