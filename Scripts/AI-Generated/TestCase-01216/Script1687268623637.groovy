import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_new-here-then-come-in-and-say-5'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/new-here-then-come-in-and-say-hi/67591/5')

'step 2: Add visual checkpoint at Page_t_new-here-then-come-in-and-say-5'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01216_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
