package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class steps {


    @Given("I am an authenticated github user")
    public void i_am_an_authenticated_github_user() {
        System.out.println("i_am_an_authenticated_github_user");

    }
    @When("I send a request to create a repository with name as {string} and with description {string}")
    public void i_send_a_request_to_create_a_repository_with_name_as_and_with_description(String string, String string2) {
        System.out.println("i_send_a_request_to_create_a_repository_with_name_as_and_with_description");
    }
    @Then("the response code should be {int}")
    public void the_response_code_should_be(Integer int1) {
        System.out.println("the_response_code_should_be");

    }
    @Then("the response should contain the repository name {string}")
    public void the_response_should_contain_the_repository_name(String string) {
        System.out.println("the_response_should_contain_the_repository_name");

    }
    @Then("the response time should be less than {int} milliseconds")
    public void the_response_time_should_be_less_than_milliseconds(Integer int1) {
        System.out.println("the_response_time_should_be_less_than_milliseconds");


    }

}
