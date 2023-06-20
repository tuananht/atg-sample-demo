import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_open-a-deep-link-via-browser-in-an-already-open-application-solved'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/open-a-deep-link-via-browser-in-an-already-open-application-solved/32791')

'step 2: Add visual checkpoint at Page_t_open-a-deep-link-via-browser-in-an-already-open-application-solved'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00192_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
