import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_filtering-capture-the-specific-index-of-array-from-json'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/filtering-capture-the-specific-index-of-array-from-json/52399')

'step 2: Add visual checkpoint at Page_t_filtering-capture-the-specific-index-of-array-from-json'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00825_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
