import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_tip-for-finding-css-xpath-locators-using-chrome-with-an-5'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/tip-for-finding-css-xpath-locators-using-chrome-with-an-example/9032/5')

'step 2: Add visual checkpoint at Page_t_tip-for-finding-css-xpath-locators-using-chrome-with-an-5'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01374_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
