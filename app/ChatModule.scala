import controllers.ChatController
import play.api.i18n.Langs
import play.api.mvc.ControllerComponents
import services.ServicesModule

trait ChatModule extends ServicesModule {

  import com.softwaremill.macwire._

  lazy val greeterController = wire[ChatController]

  def langs: Langs

  def controllerComponents: ControllerComponents
}
