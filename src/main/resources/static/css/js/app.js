$(document).ready(
        function () {

            // SUBMIT FORM
            $("#messageForm").submit(function (event) {
                // Prevent the form from submitting via the browser.
                event.preventDefault();
                ajaxPost();
            });

            function ajaxPost() {

                // PREPARE FORM DATA
                var formData = {
                    name: $("#namec").val(),
                    email: $("#emailc").val(),
                    text: $("#txtc").val()
                }
                // DO POST
                $.ajax({
                    type: "POST",
                    contentType: "application/json",
                    url: "/contact",
                    data: JSON.stringify(formData),
                    dataType: 'json',
                    success: function (result) {
                           alert("Message Successfully!")  
                        console.log(result);
                    },
                    error: function (e) {
                        alert("Error!")
                        console.log("ERROR: ", e);
                    }
                });

            }

        })