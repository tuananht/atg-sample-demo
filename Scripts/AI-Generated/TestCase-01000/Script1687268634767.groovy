import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_i-can-not-do-and-save-a-screenshot-to-a-webelement-image-using-ashot'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/i-can-not-do-and-save-a-screenshot-to-a-webelement-image-using-ashot/31330')

'step 2: Add visual checkpoint at Page_t_i-can-not-do-and-save-a-screenshot-to-a-webelement-image-using-ashot'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01000_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
