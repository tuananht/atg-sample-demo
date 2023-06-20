import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_request-interception-with-chrome-console'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/request-interception-with-chrome-console/36515')

'step 2: Add visual checkpoint at Page_t_request-interception-with-chrome-console'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00226_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
