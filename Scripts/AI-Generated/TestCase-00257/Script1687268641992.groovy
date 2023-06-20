import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_comparing-prod-vs-dev-website-using-multiple-urls-per-website'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/comparing-prod-vs-dev-website-using-multiple-urls-per-website/61687')

'step 2: Add visual checkpoint at Page_t_comparing-prod-vs-dev-website-using-multiple-urls-per-website'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00257_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
