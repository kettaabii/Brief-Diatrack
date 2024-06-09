<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>



<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
    <style><%@include file="Style.css" %></style>
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons+Sharp" rel="stylesheet">

</head>
<body>
<header>
    <div class="top-nav">
        <img src="https://i.ibb.co/X5RNhFw/Diatrack-logo.png" style="height:100% ; width: auto;"/>
        <div class="navlinks">
            <a class="active" href="#home">Home</a>
            <a href="#news">About us</a>
        </div>
        <a href="#">
            <div class="support" style="display: flex;align-items: center;border-radius: 6px;background-color: #03045E;padding: 6px;">
                <span class="material-icons-sharp" >support_agent</span>
                <div class="sub-support" style="display:flex ;flex-direction: column;align-items:flex-start; ">
                    <p style=" font-size: 0.7rem;">Get our support 24/7</p>
                    <h1 style=" font-size: 1.5rem;">Need help !</h1>
                </div>
            </div>
        </a>

    </div>
</header>
<main>
<div class="header-container" style="background-color: #00B4D8; display: flex ; justify-content: center;padding: 7rem; ">
    <h1> Track your Blood Sugar </h1>
</div>
<div class="body-form-container" style="display: flex; justify-content: space-evenly; background-color: #CAF0F8" >
    <div class="form-container" style="width: 85%; padding: 3rem;  ">
<form:form action="save-prelevement" modelAttribute="prelevement" method="post">
            <div class="form-elements">
                <div class="form-group">
                    <label for="datePrelevement">Date de prelevement:</label>
                    <form:input path="datePrelevement" id="datePrelevement" name="datePrelevement" type="datetime-local" required="true" />

                </div>

                <div class="form-group">
                    <label for="niveauGlicemique">Niveau Glisemique:</label>
                    <form:input path="niveauGlicemique" id="niveauGlicemique" name="niveauGlicemique" type="number" step="0.1" required="true" style="width: 70%;" />

                </div></div>
            <div class="table-range">
                <form:input  path="range" id="range" name="range" type="text" required="true" value="NORMAL" cssStyle="display: hidden;"/>
                <div class="ranges-top" style="display: grid;grid-template-columns: 1fr 1fr 1fr">
                    <div class="rn">
                        <h1>Entre 0,7 et 1,1 g/L</h1>
                    </div>
                    <div class="rn">
                        <h1>Entre 1,10 et 1,27 g/L</h1>
                    </div>
                    <div class="rn" style="border-right: none;">
                        <h1>>= 1,26 g/L</h1>
                    </div>
                </div>
                <div class="range-banner" style="margin-top: 2rem;">


                </div>


            </div>
            <div class="btn-div" >
                <button class="btn" type="submit">Submit</button>
            </div>
</form:form>
    </div></div>
<div class="header-container" style="background-color: #00B4D8; display: flex ; justify-content: center;padding: 5rem; ">
    <h1> Don't skip Your Medicaments </h1>
</div>
<div class="meds-container"  >

    <div class="meds-container-all" style="width: 85%;  padding: 2rem; ">
        <h1>Medicaments</h1>

        <div class="meds-list" style="display: grid; grid-template-columns: 1fr 1fr 1fr 1fr; gap: 1rem;">

            <c:forEach var="medicament" items="${medicalisation}">

                <div class="med-name" onclick="showMedDetails(this)" data-type="${medicament.type_Medicament}" data-libelle="${medicament.libelle_Medicament}" data-dose-jr="${medicament.doseJournaliere}" data-dose-prises="${medicament.dosesPrise}" data-id="${medicament.idMedicament}">
                    <h1>${medicament.libelle_Medicament}</h1>
                </div>

            </c:forEach>
        </div>

        <div class="med-details" >
            <div  class="med-details-left" >
                <div class="title-doses-med"  >
                    <h1 id="med-details-name"> medicament 1 </h1>
                    <div style="display: flex; background-color: #03045E; color: #f2f2f2;padding: 3px; border-radius: 6px;" ><p id="med-details-doses">  </p><p>/jour</p></div>
                    <p id="med-details-type">  </p>
                </div>
                <div class="doses-count">
                    <p> Aujourd'hui</p>
                    <div class="round-boxes">
                        <div class="round" >

                        </div>
                        <div class="round" >

                        </div>
                        <div class="round" >

                        </div>
                    </div>
                </div>
                <div class="take-pill" >
                    <form id="incrementDosesForm" action="incrementDoses" method="post">
                        <input id="btn-je-prend" type="hidden" name="medicamentId" value="" />
                        <input type="hidden" id="dailyDosesInput" value="" />
                        <input type="hidden" id="dosesTakenInput" value="" />
                        <button class="btn-pill" type="submit">Je prend</button>
                    </form>
                </div>
            </div>

            <div class="med-details-right"style="background-color: #00B4D8">

            </div>

        </div>

    </div>


</div>
</main>

<script>
    function showMedDetails(element) {
        // Log the clicked medicament ID
        console.log("Clicked medicament ID:", element.getAttribute("data-id"));
        console.log("libelle",element.getAttribute("data-libelle"));
        // Retrieve the ID of the clicked medicament
        var medid =element.getAttribute("data-id");
        var type = element.getAttribute("data-type");
        var libelle = element.getAttribute("data-libelle");
        var doses = element.getAttribute("data-dose-jr");
        var dosesTaken = element.getAttribute("data-dose-prises");
        // Find the selected medicament from the list using its ID
        document.getElementById("med-details-name").textContent=libelle;
        document.getElementById("med-details-type").textContent=type;
        document.getElementById("med-details-doses").innerText=doses ;
        document.getElementById("btn-je-prend").value=medid ;
        document.getElementById("dailyDosesInput").value=doses ;
        document.getElementById("dosesTakenInput").value=dosesTaken ;

        var remainingDoses = parseInt(doses) - dosesTaken;

        // Get the container for the circles
        var roundBoxesContainer = document.querySelector('.round-boxes');

        // Clear any existing circles
        roundBoxesContainer.innerHTML = '';

        // Generate circles based on the remaining doses
        for (var i = 0; i < doses; i++) {
            var roundDiv = document.createElement('div');
            roundDiv.className = 'round';
            if (i < dosesTaken) {
                roundDiv.classList.add('taken'); // Add 'taken' class for doses already taken
            } else {
                roundDiv.classList.add('not-taken'); // Add 'not-taken' class for doses not taken
            }
            roundBoxesContainer.appendChild(roundDiv);
        }
        document.getElementById("incrementDosesForm").addEventListener("submit", function(event) {
            // Retrieve the number of doses for the day and doses already taken
            var dailyDoses = parseInt(document.getElementById("dailyDosesInput").value);
            var dosesTaken = parseInt(document.getElementById("dosesTakenInput").value);

            // Check if all doses for the day have been taken
            if (dosesTaken >= dailyDoses) {
                // Prevent form submission
                event.preventDefault();
                // Optionally, you can display a message to the user indicating that all doses for the day have been taken
                alert("All doses for the day have been taken.");
            }
        });
        // Update the HTML content of the med-details section with the selected medicament's details

        // Update other details similarly
    }
</script>
</body>
</html>

