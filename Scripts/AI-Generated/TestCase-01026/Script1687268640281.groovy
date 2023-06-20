import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_when-we-are-select-the-value-from-the-spinner-it-capture-event-on-which-attribute-show-in-background-of-spinner-why'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/when-we-are-select-the-value-from-the-spinner-it-capture-event-on-which-attribute-show-in-background-of-spinner-why/78984')

'step 2: Add visual checkpoint at Page_t_when-we-are-select-the-value-from-the-spinner-it-capture-event-on-which-attribute-show-in-background-of-spinner-why'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01026_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
