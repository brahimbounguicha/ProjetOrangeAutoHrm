#Author Proservice
Feature: Consultation des menu de home page

Background: 

Given utilisateur est conectee avec le bon username "Admin" et le bon password "admin123"

  Scenario Outline: Acceder aux page de chaque menu de la page home
    When utlisateur clique sur le "<menu>"
    Then la page de meu est affiché "<menu>"

    Examples: 
      | menu        |
      | Admin       |
      | PIM         |
      | Leave       |
      | Time        |
      | Recruitment |
      | My Info     |
      | Performance |
      | Dashboard   |
      | Maintenance |
      | Claim       |
      | Buzz        |
      | Directory   |
