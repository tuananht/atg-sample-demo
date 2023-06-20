import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_click-on-text-found-with-4'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/click-on-text-found-with-xpath/22067/4')

'step 2: Add visual checkpoint at Page_t_click-on-text-found-with-4'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01295_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
