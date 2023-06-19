import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_how-to-find-web-element-by-id-and-class'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/how-to-find-web-element-by-id-and-class/62227')

'step 2: Add visual checkpoint at Page_t_how-to-find-web-element-by-id-and-class'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00057_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
