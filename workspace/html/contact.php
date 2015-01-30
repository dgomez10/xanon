<?php
  if($_POST["InputEmail"] && $_POST["InputQuestion"]){
    mail("avarshney65@gmail.com", "Lucrativity", $_POST["InputQuestion"], $_POST["InputEmail"]);
  }
?>