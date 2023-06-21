import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_webinars_state-of-software-quality-insights'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/webinars/state-of-software-quality-insights')

'step 2: Add visual checkpoint at Page_webinars_state-of-software-quality-insights'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00129_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
