import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_autocomplete-doesnt-work-in-script-modee'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/autocomplete-doesnt-work-in-script-modee/53504')

'step 2: Add visual checkpoint at Page_t_autocomplete-doesnt-work-in-script-modee'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00675_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
