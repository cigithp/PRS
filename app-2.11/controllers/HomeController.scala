package controllers
import play.api.mvc._

/**
  * Created on 7/29/17.
  */
class HomeController extends Controller {
  def index = Action {
    Ok("Your application is running")
  }
}
