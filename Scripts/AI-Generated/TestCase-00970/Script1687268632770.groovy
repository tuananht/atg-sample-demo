import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_how-to-store-url-obtained-through-current-url-webui-geturl-in-test-data-in-data-files'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/how-to-store-url-obtained-through-current-url-webui-geturl-in-test-data-in-data-files/61549')

'step 2: Add visual checkpoint at Page_t_how-to-store-url-obtained-through-current-url-webui-geturl-in-test-data-in-data-files'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00970_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
