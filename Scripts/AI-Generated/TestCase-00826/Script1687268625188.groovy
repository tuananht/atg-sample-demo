import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_start-application-failed-caused-by-java-net-connectexception-connection-refused-connect'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/start-application-failed-caused-by-java-net-connectexception-connection-refused-connect/60511')

'step 2: Add visual checkpoint at Page_t_start-application-failed-caused-by-java-net-connectexception-connection-refused-connect'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00826_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
