import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_can-i-use-free-version-of-katalon-studio-in-commerial-2'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/can-i-use-free-version-of-katalon-studio-in-commerial-project/13604/2')

'step 2: Add visual checkpoint at Page_t_can-i-use-free-version-of-katalon-studio-in-commerial-2'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01394_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
