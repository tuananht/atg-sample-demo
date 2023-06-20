import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_unable-to-open-chrome-from-13'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/unable-to-open-chrome-from-katalon/57047/13')

'step 2: Add visual checkpoint at Page_t_unable-to-open-chrome-from-13'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01172_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
