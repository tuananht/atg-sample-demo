import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_store-text-get-text-and-store-in-a-variable'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/store-text-get-text-and-store-in-a-variable/8438')

'step 2: Add visual checkpoint at Page_t_store-text-get-text-and-store-in-a-variable'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01047_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
