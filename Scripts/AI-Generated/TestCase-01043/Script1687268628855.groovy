import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_custom-keyword-to-receive-gmail'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/custom-keyword-to-receive-gmail/21381')

'step 2: Add visual checkpoint at Page_t_custom-keyword-to-receive-gmail'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01043_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
