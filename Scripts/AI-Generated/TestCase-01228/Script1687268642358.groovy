import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_how-to-retrieve-response-header-of-a-network-request-in-a-2'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/how-to-retrieve-response-header-of-a-network-request-in-a-browser/63834/2')

'step 2: Add visual checkpoint at Page_t_how-to-retrieve-response-header-of-a-network-request-in-a-2'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01228_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
