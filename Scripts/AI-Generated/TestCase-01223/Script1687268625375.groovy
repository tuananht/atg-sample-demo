import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_partial-search-in-the-search-5'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/partial-search-in-the-search-box/46062/5')

'step 2: Add visual checkpoint at Page_t_partial-search-in-the-search-5'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01223_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
