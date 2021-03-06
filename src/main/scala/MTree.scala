import scala.None

/**
  * Created by marek on 24.06.16.
  */
case class MTree(url : String, parent: Option[MTree] = None){

  def getParents() : String = {
    parent match {
      case Some(parent) => url +"\n"+ parent.getParents()
      case None =>  url
    }
  }
}